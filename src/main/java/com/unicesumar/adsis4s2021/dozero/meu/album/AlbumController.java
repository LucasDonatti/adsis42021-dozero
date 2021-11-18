package com.unicesumar.adsis4s2021.dozero.meu.album;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unicesumar.adsis4s2021.dozero.meu.base.BaseCrudController;

@RestController
@RequestMapping("/api/albuns")
public class AlbumController extends BaseCrudController<Album, AlbumRepository, AlbumService> {

}
