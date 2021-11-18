package com.unicesumar.adsis4s2021.dozero.meu.album;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.unicesumar.adsis4s2021.dozero.meu.base.BaseCrudService;

@Service
@Transactional
public class AlbumService extends BaseCrudService<Album, AlbumRepository> {

}
