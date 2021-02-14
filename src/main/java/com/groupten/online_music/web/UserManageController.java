package com.groupten.online_music.web;

import com.groupten.online_music.common.utils.exception.ApplicationException;
import com.groupten.online_music.common.utils.ResponseEntity;
import com.groupten.online_music.common.utils.STablePageRequest;
import com.groupten.online_music.entity.EmailConfirm;
import com.groupten.online_music.entity.User;
import com.groupten.online_music.service.impl.IEmailService;
import com.groupten.online_music.service.impl.IUserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/admin")
public class UserManageController {
//    @Autowired
//    private IUserManageService userManageService;
//    @Autowired
//    private IEmailService emailService;
//
//    @ResponseStatus(HttpStatus.CREATED)
//    @PostMapping
//    public ResponseEntity add(@RequestParam Map<String, String> userMap) {
//        User user = new User(userMap);
//        ResponseEntity<User> responseEntity = new ResponseEntity<User>();
//        if (!userManageService.hasUser(user) && userManageService.findByEmail(user.getEmail()) == null) {
//            user = userManageService.save(user);
//        } else {
//            return responseEntity.message("有重名用户或邮箱已注册");
//        }
//
//        return responseEntity.message("用户添加成功").data(user);
//    }
//
//    @GetMapping
//    @ResponseBody
//    public ResponseEntity FindAll(@RequestParam Map<String, String> pagingMap) {
//        ResponseEntity<Page<User>> responseEntity = new ResponseEntity<>();
//        STablePageRequest tablePageRequest = new STablePageRequest(pagingMap);
//        Page<User> page = Page.empty(tablePageRequest.sTablePageable());
//        page = userManageService.findAll(tablePageRequest.sTablePageable());
//
//        return responseEntity.message("分页查询成功").data(page);
//    }
//
//    @DeleteMapping("/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    @ResponseBody
//    public ResponseEntity delete(@PathVariable int id) {
//        //响应结果
//        ResponseEntity<User> responseEntity = new ResponseEntity<User>();
//        //删除操作
//        User target = userManageService.findById(id);
//        //存在用户，删除相关信息
//        if (target != null) {
//            userManageService.delete(target);
//            EmailConfirm emailConfirm = emailService.findOne(target.getEmail());
//            if (emailConfirm != null) emailService.delete(emailConfirm);
//        } else {
//            throw new ApplicationException("删除请求失败！ 目标对象为null");
//        }
//
//        return responseEntity.message("删除请求成功！");
//    }
//
//    public ResponseEntity shutDownUser(@PathVariable int id) {
//        return null;
//    }
}
