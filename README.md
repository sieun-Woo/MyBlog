# MyBlog
Spring 입문 주차 개인 과제

**API 명세서**
|Method|URL|Description|Request|Response|
|-|-|-|-|-|
|GET|/api/posts|전체 게시글 목록 조회|-|[{"createdAt": "2022-12-09T10:40:29.705468","modifiedAt": "2022-12-09T10:40:29.705468","id": 1,"username": "username","title": "title","contents": "contents"}]|
|GET|/api/post/{id}|선택한 게시글 조회|-|{"createdAt": "2022-12-09T10:40:29.705468","modifiedAt": "2022-12-09T10:40:29.705468","id": 1,"username": "username","title": "title","contents": "contents"}|
|POST|/api/post|선택한 게시글 작성|{"username": "username","title" : "title","password" : "password","contents": "contents"}|{"createdAt": "2022-12-09T10:40:29.7054683","modifiedAt": "2022-12-09T10:40:29.7054683","id": 1,"username": "username","title": "title","contents": "contents"}|
|PUT|/api/post/{id}|선택한 게시글 수정|{"username": "username2","title" : "title2","password" : "password","contents": "contents2"}|{"createdAt": "2022-12-09T10:40:29.705468","modifiedAt": "2022-12-09T10:44:50.0850796","id": 1,"username": "username2","title": "title2","contents": "contents2"}|
|DELETE|/api/post/{id}|선택한 게시글 삭제|{"password" : "password"}|포스트를 삭제하였습니다.|


JSON 형식 데이터를 담기 위해 RequestBody 방식을 사용하였습니다.

HTTP Method(POST, GET, PUT, DELETE)를 통한 CRUD Operation을 수행 할 수 있는 자원(Resource)을 HTTP URI(Uniform Resource Identifier)를 통해 명시하였습니다.

Controller, Repository, Service를 분리하였습니다. 
Controller는 클라이언트로부터 받은 요청을 Service로 전달하였습니다.
Service에는 전달받은 요청을 수행 할 수 있는 로직들을 작성하였습니다.
Repository는 DB와 연결하여 DB와 관련된 로직을 수행하였습니다.


