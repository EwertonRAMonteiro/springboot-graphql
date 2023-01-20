package com.example.graphql;

// referente ao metodo post
record Post(String id, String content)  {
}

// referente ao metodo decomentario + relação com o post
record Comment(String id, String content, String postId) {

}
