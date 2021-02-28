package top.lixiang007.controler;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class testpage {

    @RequestMapping("/helloworld")
    public String hello(){
        System.out.println("hello world");
        return "index";
    }
//由于版本原因 这个功能还有问题
    @ResponseBody
    @RequestMapping(value="/body/{x}", method = RequestMethod.GET)
    public bodytest getBody(@PathVariable("x") String x){
        System.out.println("URI Part 1 : " + x);
        bodytest bt = new bodytest();
        bt.a = x;
        bt.b = "123";
        return bt;
    }

    public class  bodytest
    {
        public  String a;
        public String b;
    }

    /*
    *
    @RequestMapping(value = "/user/{userId}/roles/{roleId}", method = RequestMethod.GET)
    public String getLogin(@PathVariable("userId") String userId,
                           @PathVariable("roleId") String roleId) {

        System.out.println("User Id : " + userId);
        System.out.println("Role Id : " + roleId);
        return "success";
    }
    @RequestMapping(value="/product/{productId}",method = RequestMethod.GET)
    public String getProduct(@PathVariable("productId") String productId){
        System.out.println("Product Id : " + productId);
        return "success";
    }
    * */
}
