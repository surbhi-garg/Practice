package com.demo.restWithSpring.post.controller;

import com.demo.restWithSpring.post.Post;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.ParameterizedType;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    @GetMapping("/")
    public List<Post> getPostsList() {
        RestTemplate restTemplate = new RestTemplate();
        String uri = "https://jsonplaceholder.typicode.com/posts";
        ResponseEntity<List<Post>> responseEntity = restTemplate.exchange(uri, HttpMethod.GET, null, new ParameterizedTypeReference<List<Post>>() {
        });
        return responseEntity.getBody();
    }
    @GetMapping("/{id}")
    public Post getPost(@PathVariable Long id)
    {
        RestTemplate restTemplate=new RestTemplate();
        String uri = "https://jsonplaceholder.typicode.com/posts/"+id;
        ResponseEntity<Post>responseEntity=restTemplate.getForEntity(uri,Post.class);
        return responseEntity.getBody();

    }
    @PostMapping("/createPost")
    public ResponseEntity<Post> createPost(@RequestBody Post post)
    {
        String url="https://jsonplaceholder.typicode.com/posts";
        RestTemplate restTemplate= new RestTemplate();
        HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.add("Content-type","application/json; charset=UTF-8");
        HttpEntity<Post> request=new HttpEntity<>(post,httpHeaders);
        Post postCreated=restTemplate.postForObject(url,request,Post.class);
        System.out.println(post);
        return new ResponseEntity<Post>(postCreated, HttpStatus.CREATED);
    }
    @PutMapping("/updatePost/{id}")
    public ResponseEntity<Post> updatePost(@PathVariable Long id){
        String url="https://jsonplaceholder.typicode.com/posts/"+id;
        RestTemplate restTemplate= new RestTemplate();
        HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.add("Content-type","application/json; charset=UTF-8");
        HttpEntity<Post> request=new HttpEntity<>(new Post(id,100L,"title1","description1"),httpHeaders);
        return restTemplate.exchange(url,HttpMethod.PUT,request,Post.class);
    }

    @DeleteMapping("/deletePost/{id}")
    public void deletePost(@PathVariable Long id){
        String url="https://jsonplaceholder.typicode.com/posts/"+id;
        RestTemplate restTemplate= new RestTemplate();
        HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.add("Content-type","application/json; charset=UTF-8");
        HttpEntity<Post> request=new HttpEntity<>(httpHeaders);
        restTemplate.exchange(url,HttpMethod.DELETE,request,Post.class);
    }

}
