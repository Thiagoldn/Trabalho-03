package br.com.musica.musicaws.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.musica.musicaws.model.Musica;
import br.com.musica.musicaws.repository.MusicaRepository;
import br.com.musica.musicaws.shared.MusicaDto;

@Service
public class MusicaServiceImpl implements MusicaService {

    @Autowired
    MusicaRepository repo;

    @Override
    public List<MusicaDto> listarMusicas() {
        List<Musica> musicas = repo.findAll();
       
        return musicas.stream()
        .map(f -> new ModelMapper().map(f, MusicaDto.class))
        .collect(Collectors.toList());

    
}

    @Override
    public MusicaDto criarMusica(MusicaDto musica) {
        Musica musicGravar = new ModelMapper().map(musica, Musica.class);
        musicGravar = repo.save(musicGravar);

        return new ModelMapper().map(musicGravar, MusicaDto.class);
    }

    @Override
    public void excluirMusica(String id) {
        repo.deleteById(id);  
    }
        

    @Override
    public Optional<MusicaDto> atualizarMusica(String id, MusicaDto musica) {
        ModelMapper mapper = new ModelMapper();
       Optional<Musica> mus = repo.findById(id);
       Musica musicSalvar = mapper.map(musica, Musica.class);
        if (mus.isPresent()){
            musicSalvar.setId(id);
            musicSalvar = repo.save(musicSalvar);
            return Optional.of(mapper.map(musicSalvar, MusicaDto.class));
        }
        return Optional.empty();
      
    }

 

  
}
