# ToggleButton
`ToggleButton`을 사용하면 두 상태 사이의 설정을 변경할 수 있습니다. 

![image](https://user-images.githubusercontent.com/73263733/151460442-a9464549-f2fb-41b5-a603-8f649092f9fe.png)
![image](https://user-images.githubusercontent.com/73263733/151460482-fcd18200-f979-4b2d-b06a-198414c9979f.png)
<br/>

## ToggleButton 기본 사용법
https://user-images.githubusercontent.com/73263733/151460597-eda849b0-1ee0-49ce-82d6-6d8614ee19c0.mov

아래 코드를 실행시키면 위의 동영상처럼 동작합니다.

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="horizontal"
    tools:context=".MainActivity">

    <ToggleButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textOn="전원 On"
        android:textOff="전원 Off" />

</LinearLayout>
```
<br/>

## ToggleButton 속성들
### ToggleButton의 Button 속성
`enabled` 속성은 `ToggleButton`을 켤 수 있거나 켤 수 없는 상태로 설정할 수 있게 합니다. 값은 **true**나 **false**로 지정할 수 있으며, false일 경우 해당 `ToggleButton`을 켤 수 없게 만듭니다.

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <ToggleButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textOn="전원 On"
        android:textOff="전원 Off"
        **android:enabled="true"**/>

</LinearLayout>
```
<br/>

`clickable` 속성은 `ToggleButton`을 클릭할 수 없게 만들거나 클릭할 수 있도록 설정합니다. 값은 **true**나 **false**로 지정할 수 있으며, false일 경우 해당 `ToggleButton`을 클릭할 수 없게 만듭니다.

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <ToggleButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textOn="전원 On"
        android:textOff="전원 Off"
        **android:clickable="false"**/>

</LinearLayout>
```
<br/>

### ToggleButton의 Text 속성
`textOn` 속성은 `ToggleButton`이 켜졌을 때, `textOff` 속성은 `ToggleButton`이 꺼졌을 때의 상태를 사용자에게 설명하거나 할 때 지정합니다.  
`textStyle` 속성은 `text`를 두껍게(`bold`) 표시할 것인지, 기울여서(`italic`) 표시할 것인지, 보통 텍스트처럼(`normal`) 표시할 것인지를 지정할 수 있습니다.  
`textSize` 속성은 `text`의 크기를 정할 수 있습니다. `17dp`, `17sp`, `17px`, `17pt` 등으로 지정할 수 있으며, 보통은 `sp`를 사용합니다.

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <ToggleButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        **android:textOn="전원 On"
        android:textOff="전원 Off"
        android:textStyle="bold"
        android:textSize="17sp"**/>

</LinearLayout>
```
<br/>

### Default Turned On ToggleButton 설정
사용자가 선택을 하지 않아도 기본적으로 켜져 있는 `ToggleButton`을 만들기 위해서는 `ToggleButton`에 `checked` 속성을 추가해야 합니다. `checked`는 **true**와 **false** 두 가지의 상태를 지정할 수 있으며 true일 경우 기본적으로 켜져 있는 `ToggleButton`을 만들 수 있습니다.

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <ToggleButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textOn="전원 On"
        android:textOff="전원 Off"
        **android:checked="true"**/>

</LinearLayout>
```
<br/>

### 코틀린 코드에서 ToggleButton 속성 지정하기
`ToggleButton`가 켜졌을 때, 꺼졌을 때의 텍스트는 *`textOn`*, *`textOff`* 를 통해 지정할 수 있습니다.  
`enabled` 속성은 *`isEnabled`*, `checked` 속성은 *`isChecked`*, `clickable` 속성은 *`isClickable`* 를 통해서 지정할 수 있습니다.

```kotlin
class MainActivity : AppCompatActivity() {

    private val tbPower: ToggleButton by lazy {
        findViewById(R.id.tbPower)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        **tbPower.textOn = "Power On"
        tbPower.textOff = "Power Off"
        tbPower.isEnabled = false
        tbPower.isChecked = true
        tbPower.isClickable = false**

    }
}
```
<br/>

## ToggleButton 사용 예
### ToggleButton의 상태 가져오기
*`isChecked`* 를 통해 해당 `ToggleButton`이 켜졌는지, 꺼졌는지를 확인하고 값을 가져올 수 있습니다.  
일반적으로는 `setOnClickListener`를 등록하여 해당 `ToggleButton`이 클릭될 때마다 *`isChecked`* 의 값이 **true**인지 **false**인지를 확인하고 상태를 가져올 수 있습니다.

```kotlin
package com.os_companies.aos_togglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {

    private val tbPower: ToggleButton by lazy {
        findViewById(R.id.tbPower)
    }

    private val tbPowerButton: ToggleButton by lazy {
        findViewById(R.id.tbPowerButton)
    }

    private val tvInformation: TextView by lazy {
        findViewById(R.id.tvInformation)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        **tbPowerButton.setOnClickListener {
            if(tbPowerButton.isChecked) {
                tvInformation.text = "전원이 켜져있습니다."
            } else {
                tvInformation.text = "전원이 꺼져있습니다."
            }
        }**

    }
}
```
<br/>

## ToggleButton 커스텀하기
### ToggleButton 이미지로 커스텀하기
1. res/drawable 우클릭 → New → Vector Asset
    
    Clip Art에서 Icon을 골라 `ToggleButton`이 켜졌을 때와 `ToggleButton`이 꺼졌을 때의 이미지를 만듭니다.
    ![image](https://user-images.githubusercontent.com/73263733/151461270-86e51448-a32f-4fd3-99d1-c54070de4e1d.png)
    
2. res/drawable 우클릭 → New → Drawable Resource File에서 Root Element는 Selector로 두고 `ToggleButton` 관련 xml 파일을 하나 생성합니다.
3. 생성한 xml 파일에 `ToggleButton`이 켜졌을 때와 꺼졌을 때를 지정합니다.
    
    `state_checked="false"`에는 `ToggleButton`이 **켜지지 않았을 때**의 이미지를, `state_checked="true"`에는 `ToggleButton`이 **켜졌을 때**의 이미지를 지정해줍니다.
    
    - res/drawable/toggle_image_custom.xml
    
    ```xml
    <?xml version="1.0" encoding="utf-8"?>
    <selector xmlns:android="http://schemas.android.com/apk/res/android">
        <item android:state_checked="true"
            android:drawable="@drawable/ic_toggle_button_on_24" />
        <item android:state_checked="false"
            android:drawable="@drawable/ic_toggle_button_off_24" />
    </selector>
    ```
    
4. 위에서 만든 `ToggleButton`의 커스텀 스타일을 적용하고 싶은 `ToggleButton`의 `background` 속성에 지정해 추가합니다.
- res/layout/activity_main.xml
    
    ```xml
    <?xml version="1.0" encoding="utf-8"?>
    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        tools:context=".MainActivity">
    
        <ToggleButton
            android:layout_width="100dp"
            android:layout_height="95dp"
            android:textColor="@color/white"
            **android:background="@drawable/toggle_image_custom"**/>
    
    </LinearLayout>
    ```
    

코틀린 파일에서 적용하는 방법은 아래와 같습니다.

- MainActivity.kt
    
    ```kotlin
    class MainActivity : AppCompatActivity() {
    
        private val tbPowerImageButton: ToggleButton by lazy {
            findViewById(R.id.tbPowerImageButton)
        }
    
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
    
            **tbPowerImageButton.background = resources.getDrawable(R.drawable.toggle_image_custom, null)**
    
        }
    }
    ```
<br/>    

### ToggleButton xml로 커스텀하기
1. res/drawable 우클릭 → New → Drawable Resource File에서 Root Element는 Selector로 두고 `ToggleButton` 관련 xml 파일을 하나 생성합니다.
2. 생성한 xml 파일에 `ToggleButton`이 켜졌을 때와 꺼졌을 때를 지정합니다
    
    `state_checked="false"`에는 `ToggleButton`이 **켜지지 않았을 때**의 모양을, `state_checked="true"`에는 `ToggleButton`이 **켜졌을 때**의 모양을 정해줍니다.
    
    저는 켜졌을 때는 분홍색 배경의 직사각형으로 버튼이 바뀌고, 선택이 되지 않았을 때에는 기본적으로 회색 배경의 직사각형으로 보이도록 아래와 같이 작성했습니다.
    
    - res/drawable/toggle_xml_custom.xml
    
    ```xml
    <?xml version="1.0" encoding="utf-8"?>
    <selector xmlns:android="http://schemas.android.com/apk/res/android">
        <**item android:state_checked="true"**>
            <shape android:shape="rectangle">
                <corners android:radius="10dp"/>
                <solid android:color="#FFBBBB" />
            </shape>
        </item>
        <**item android:state_checked="false"**>
            <shape android:shape="rectangle">
                <corners android:radius="10dp"/>
                <solid android:color="#DDDDDD" />
            </shape>
        </item>
    </selector>
    ```
    
3. 위에서 만든 `ToggleButton`의 커스텀 스타일을 적용하고 싶은 `ToggleButton`의 `background` 속성에 지정해 추가합니다. 
- res/layout/activity_main.xml

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <ToggleButton
        android:id="@+id/tbPowerXmlButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textColor="@color/white"
        **android:background="@drawable/toggle_xml_custom"**/>

</LinearLayout>
```
<br/><br/>

코틀린 파일에서 적용하는 방법은 아래와 같습니다.
- MainActivity.kt

```kotlin
class MainActivity : AppCompatActivity() {

    private val tbPowerXmlButton: ToggleButton by lazy {
        findViewById(R.id.tbPowerXmlButton)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        **tbPowerXmlButton.background = resources.getDrawable(R.drawable.toggle_xml_custom, null)**

    }
}
```
<br/>

## 그 외

- 전체 코드
    [https://github.com/OSCompanies/AOS_ToggleButton.git](https://github.com/OSCompanies/AOS_ToggleButton.git)
