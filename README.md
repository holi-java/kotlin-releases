# Kotlin-1.2-M1


## Features


- [Array literals], which can be used in annotation arguments, e.g:`@View(names = ["foo", "bar"])`.
- Supports [default values] for functional parameters in inline function.


## Extensions


- Collections
  - [MutableList.fill()] extension
  - [MutableList.shuffle()] & [List.shuffled()]  extensions
  - [List.chunked()] and [List.windowed()] - extension functions to support partitioning collections into blocks of the given size and taking a window of the given size and moving it along the collection with the given step.  





[Array literals]: src/test/kotlin/com/holi/kotlin/features/AnnotationArrayLiteralsArgumentsTest.kt#L10
[default values]: src/test/kotlin/com/holi/kotlin/features/InlineFunctionDefaultValueFunctionalParametersTest.kt#L38
[MutableList.fill()]: src/test/kotlin/com/holi/kotlin/extensions/CollectionExtensionsTest.kt#L14
[MutableList.shuffle()]: src/test/kotlin/com/holi/kotlin/extensions/CollectionExtensionsTest.kt#L25
[List.shuffled()]: src/test/kotlin/com/holi/kotlin/extensions/CollectionExtensionsTest.kt#L35
[List.chunked()]: src/test/kotlin/com/holi/kotlin/extensions/CollectionExtensionsTest.kt#L44-L45
[List.windowed()]: src/test/kotlin/com/holi/kotlin/extensions/CollectionExtensionsTest.kt#L53-L54