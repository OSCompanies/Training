# ViewBinding
`viewBinding`을 사용하면 쉽게 뷰와 상호작용하는 코드를 작성할 수 있습니다. 

한 번 모듈에서 enable된 `viewBinding`은 모듈에 있는 각 XML 레이아웃 파일의 `binding class`를 생성합니다. 이 `binding class`는 상응하는 레이아웃에 ID가 있는 모든 뷰의 직접 참조가 포함됩니다.

대부분의 경우, **`viewBinding`은 `findViewById()`를 대체**합니다.
<br/><br/>
# **ViewBinding 기본적인 사용법**

## **0. 종속성 추가**

`viewBinding`은 모듈별로 사용하도록 설정됩니다. 모듈에서 `viewBinding`을 enable하기 위해서 **app 모듈의 build.gradled의 build option을 true로 설정**합니다.

```groovy
android {
    ...

    viewBinding {
        enabled = true
    }
}
```
<br/>

## **1. Binding Class 생성**

만약 모듈에 `viewBinding`이 enable되었다면, 모듈이 포함하는 각 XML 레이아웃에 대한 `binding class`가 생성됩니다. 각각의 `binding class`는 ID를 가지고 있는 모든 뷰와 root 뷰에 대한 참조를 포함합니다. `binding class`의 이름은 XML 파일의 이름을 파스칼 대소문자로 변환하고 끝에 "Binding"이라는 단어를 추가하여 생성됩니다.

이렇게 생성된 `binding class`는 상응하는 레이아웃 파일의 **root 뷰에 대한 직접 참조를 제공**하는 **`getRoot()`**라는 메서드를 포함하고 있습니다.<br/><br/>

## **2. ViewBinding 사용**

### - **Activity에서의 사용**

`viewbinding`을 사용하고자 하는 Activity의 `onCreate()` 메서드에 다음 단계를 따라 작성합니다.

1. 생성된 `binding class`에 포함된 static **`inflate()` 메서드를 호출**함으로써 Activity에서 사용할  `binding class`의 객체를 만듭니다.

2. **`getRoot()` 메서드를 호출**하거나 **코틀린 프로퍼티 구문을 사용**해서 root 뷰에 대한 참조를 가져옵니다.

3. **root 뷰를 `setContentView()`로 전달**하여 화면에 활성화된 뷰를 만듭니다.

```kotlin
    private lateinit var binding: ActivitySearchWeatherBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySearchWeatherBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
```

이제 `binding class`의 객체를 사용하여 아래와 같이 뷰를 참조할 수 있습니다.

```kotlin
    binding.tvTemperature.text = it.fcstValue
    binding.btnSearch.setOnClickListener {
        // DO SOMETING
    }
```
<br/>

### - **Fragment에서의 사용**

`viewBinding`을 사용하고자 하는 Fragment의 `onCreate()` 메서드에 다음 단계를 따라 작성합니다.

1. 생성된 `binding class`에 포함된 static **`inflate()` 메서드를 호출**함으로써 Fragment에서 사용할 `binding class`의 객체를 만듭니다.

2. **`getRoot()` 메서드를 호출**하거나 **코틀린 프로퍼티 구문을 사용**해서 root 뷰에 대한 참조를 가져옵니다.

3. **`onCreateView()` 메서드로부터 root 뷰를 반환**하여 화면에 활성화된 뷰를 만듭니다.

```kotlin
private var _binding: SearchWeatherBinding? = null
// 이 속성은 오직 onCreateView와 onDestroyView 사이에서만 유효합니다.
private val binding get() = _binding!!

override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
): View? {
    _binding = SearchWeatherBinding.inflate(inflater, container, false)
    val view = binding.root
    return view
}

override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
}
```

이제 `binding class`의 객체를 사용하여 아래와 같이 뷰를 참조할 수 있습니다.

```kotlin
    binding.tvTemperature.text = it.fcstValue
    binding.btnSearch.setOnClickListener {
        // DO SOMETING
    }
```
<br/>

# **findViewById와의 차이점**

1. **Null safety** : `viewBinding`은 **뷰에 대한 직접 참조를 생성**하기 때문에 유효하지 않은 뷰의 ID로 인해 발생하는 **null pointer exception의 위험이 없습니다.**
2. **Type safety** : 각각의 `binding class`의 필드는 **XML 파일에서 참조하는 뷰와 일치하는 타입**을 가지기 때문에 **class cast exception의 위험이 없습니다.**
<br/>

# **DataBinding과의 비교**

`viewBinding`과 `dataBinding`은 직접적으로 뷰를 참조할 수 있도록 `binding class`를 생성합니다. 하지만 `viewBinding`은 **단순한 사용 사례를 처리하기 위한 것**으로 `dataBinding`에 비해 다음의 이점을 제공합니다.

1. **빠른 컴파일** : `viewBinding`은 컴파일 시간에 annotation을 확인하여 어떤 action을 하지 않기 때문에 컴파일 시간이 빠릅니다.
2. **용이성** : `viewBinding`은 특별히 태그가 지정된 XML 레이아웃 파일이 필요하지 않기 때문에 **앱에 빠르게 적용**할 수 있습니다. 한 번 모듈에 `viewBinding`을 enable 한다면 모든 모듈의 레이아웃에 자동으로 적용됩니다.
<br/>

# 그 외

- 전체 코드  
[https://github.com/OSCompanies/AOS_ViewBinding.git](https://github.com/OSCompanies/AOS_ViewBinding.git)

- 참고 자료  
[https://developer.android.com/topic/libraries/view-binding](https://developer.android.com/topic/libraries/view-binding)
