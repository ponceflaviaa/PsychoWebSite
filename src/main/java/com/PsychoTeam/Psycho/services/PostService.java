package com.PsychoTeam.Psycho.services;

import com.PsychoTeam.Psycho.Dtos.PostDTO;
import com.PsychoTeam.Psycho.Models.Client;
import com.PsychoTeam.Psycho.Models.Post;

import java.util.List;

public interface PostService {

    List<PostDTO> getPostsDTO();
    List<Post> getByClient(Client client);
    void savePost(Post post);

}
