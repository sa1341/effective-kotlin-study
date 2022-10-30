package chapter02

/**
 * 상속의 예
 */
abstract class LoaderWithProgress {

    fun load() {
        innerLoad()
    }

    abstract fun innerLoad()
}


class ProfileLoader: LoaderWithProgress() {

    override fun innerLoad() {

    }
}

class ImageLoader: LoaderWithProgress() {

    override fun innerLoad() {

    }
}
