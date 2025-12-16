package com.range.rangeWatch.common.service

import com.range.rangeWatch.anime.domain.enums.DubbingLanguage
import com.range.rangeWatch.anime.domain.enums.VideoQuality
import org.springframework.web.multipart.MultipartFile

interface VideoService {

    fun findVideo(
        bucketName: String,
        videoId: String,
        quality: VideoQuality = VideoQuality.P1080,
        language: DubbingLanguage = DubbingLanguage.SUB
    ): String?

    fun saveVideo(
        bucketName: String,
        videoId: String,
        video: MultipartFile,
        language: DubbingLanguage = DubbingLanguage.SUB
    ): String

    fun deleteVideoWithLang(
        bucketName: String,
        videoId: String,
        language: DubbingLanguage
    )
    // todo add deleteing videolist method
    //  fun deleteVideoList()

}
