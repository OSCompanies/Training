import SwiftUI

// Task가 iOS 15 이상 지원하므로 이하 버전을 대응하기 위한 로직
struct TaskModifier: ViewModifier {
    let priority: TaskPriority
    let action: @Sendable () async -> Void
    @State var task: Task<Void, Never>? = nil

    func body(content: Content) -> some View {
        content
            .onAppear {
                if task != nil {
                    task?.cancel()
                }
                task = Task(priority: priority, operation: action)
            }
            .onDisappear {
                task?.cancel()
            }
    }
}

extension View {
    @available(iOS, deprecated: 15.0)
    func task(priority: TaskPriority = .userInitiated, _ action: @escaping @Sendable () async -> Void) -> some View {
        self.modifier(TaskModifier(priority: priority, action: action))
    }
}
