package com.range.rangeWatch.anime.service.impl

import com.range.rangeWatch.anime.domain.repository.EpisodeVideoRepository
import com.range.rangeWatch.anime.dto.request.EpisodeVideoRequest
import com.range.rangeWatch.anime.service.EpisodeVideoCommandService
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile
import java.util.UUID
@Service
class EpisodeVideoCommandServiceImpl (
    private val episodeVideoRepository: EpisodeVideoRepository
): EpisodeVideoCommandService {
    override fun uploadVideo(
        episode: EpisodeVideoRequest,
        multipart: MultipartFile
    ) {
TODO()

    }

    override fun removeVideo(id: UUID) {
      return episodeVideoRepository.deleteById(id)
    }
}
