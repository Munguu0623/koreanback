package example.demo.user.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.demo.user.service.UserService;
import example.demo.user.vo.UserVo;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*") 
public class UserController{
    // @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getAllUsers") 
    public List<UserVo> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserVo getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @PostMapping("/createUser")    
    public ResponseEntity<UserVo> createUser(@RequestBody UserVo user) {
        try {
            userService.insert(user);
            return ResponseEntity.status(HttpStatus.CREATED).body(user);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/updateUser/{id}")
    public void updateUser(@PathVariable int id, @RequestBody UserVo user) {
        user.setId(id);
        userService.updateUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable int id) {
        System.out.println("id: " + id);
        userService.deleteUser(id);
    }
}
