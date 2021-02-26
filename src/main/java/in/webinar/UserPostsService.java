package in.webinar;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.javafaker.Faker;

@RestController
@RequestMapping("/posts")
public class UserPostsService {
	
	@Autowired
	private Faker faker;

	
	/**
	 * http://localhost:8081/posts/
	 * @return
	 */
	@GetMapping("/")
	public String sayHello() {
		return "UserPostsService!!";
	}
	
	
	/**
	 * http://localhost:8081/posts/v1/1
	 * @param userid
	 * @return
	 */
	@GetMapping("/v1/{userid}")
	public UserPost getUserPostsV1(@PathVariable int userid) {
		
		
		List<Post> list = new ArrayList<Post>();
		
		for(int i=0; i<10; i++) {
			String postData = faker.lorem().fixedString(50);
			Post post1 = new Post(1, postData, userid);
			list.add(post1);
		}
		
		UserPost userPost = new UserPost(list, list.size());
		return userPost;
	}
	
	
	
	/**
	 * http://localhost:8081/posts/1
	 * @param userid
	 * @return
	 */
	@GetMapping("/{userid}")
	public List<Post> getUserPosts(@PathVariable int userid) {
		
		
		List<Post> list = new ArrayList<Post>();
		
		for(int i=0; i<10; i++) {
			String postData = faker.lorem().fixedString(50);
			Post post1 = new Post(1, postData, userid);
			list.add(post1);
		}
		
		
		return list;
	}
	
	
	
}
