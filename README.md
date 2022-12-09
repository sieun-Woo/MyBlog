# MyBlog
Spring 입문 주차 개인 과제

**API 명세서**
|Method|URL|Description|Request|Response|
|-|-|-|-|-|
|GET|/api/posts|게시글 목록을 조회|-|[{"createdAt": "2022-12-09T10:40:29.705468","modifiedAt": "2022-12-09T10:40:29.705468","id": 1,"username": "username","title": "title","contents": "contents"}]|
|GET|/api/post/{id}|게시글을 조회|-|{"createdAt": "2022-12-09T10:40:29.705468","modifiedAt": "2022-12-09T10:40:29.705468","id": 1,"username": "username","title": "title","contents": "contents"}|
|POST|/api/post|게시글을 작성|{"username": "username","title" : "title","password" : "password","contents": "contents"}|{"createdAt": "2022-12-09T10:40:29.7054683","modifiedAt": "2022-12-09T10:40:29.7054683","id": 1,"username": "username","title": "title","contents": "contents"}|
|PUT|/api/post/{id}|게시글을 수정|{"username": "username2","title" : "title2","password" : "password","contents": "contents2"}|{"createdAt": "2022-12-09T10:40:29.705468","modifiedAt": "2022-12-09T10:44:50.0850796","id": 1,"username": "username2","title": "title2","contents": "contents2"}|
|DELETE|/api/post/{id}|게시글을 삭제|{"password" : "password"}|포스트를 삭제하였습니다.|
