package chapter02

/**
 * 컴포지션 사용 예
 */
class Progress {

    fun showProgress() {

    }

    fun hideProgress() {

    }
}

class ProfileLoader2 {

    val progress: Progress = Progress()

    fun load() {
        progress.showProgress()

        // 프로파일을 읽어들임

        progress.hideProgress()
    }

}

class ImageLoader2 {

    val progress: Progress = Progress()

    fun load() {
        progress.showProgress()

        // 이미지를 읽어들임

        progress.hideProgress()
    }
}
