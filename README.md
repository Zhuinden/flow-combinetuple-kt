# Flow-CombineTuple-KT

Flow-CombineTuple-KT contains helper functions for Flow, to combine their latest emissions into typed tuples.

Under the hood, it uses Tuples-KT to help provide combiners from 2 to 16 arity.

``` kotlin
combineTuple(flow1, flow2, flow3)
    .map { (t1, t2, t3) ->
        // do something with combined Flow values
    }
```

## Why?

It's useful when you want to combine multiple reactive streams together and get a combined object of the latest values, without defining an actual class with an actual name to do it.

## Using Flow-CombineTuple-KT

In order to use Flow-CombineTuple-KT, you need to add `jitpack` to your project root `build.gradle.kts`
(or `build.gradle`):

``` kotlin
// build.gradle.kts
allprojects {
    repositories {
        // ...
        maven { setUrl("https://jitpack.io") }
    }
    // ...
}
```

or

``` groovy
// build.gradle
allprojects {
    repositories {
        // ...
        maven { url "https://jitpack.io" }
    }
    // ...
}
```

In newer projects, you need to also update the `settings.gradle` file's `dependencyResolutionManagement` block:

```
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }  // <--
        jcenter() // Warning: this repository is going to shut down soon
    }
}
```


and then, add the dependency to your module's `build.gradle.kts` (or `build.gradle`):

``` kotlin
// build.gradle.kts
implementation("com.github.Zhuinden:flow-combinetuple-kt:1.1.1")
```

or

``` groovy
// build.gradle
implementation 'com.github.Zhuinden:flow-combinetuple-kt:1.1.1'
```

## License

    Copyright 2020 Gabor Varadi

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
