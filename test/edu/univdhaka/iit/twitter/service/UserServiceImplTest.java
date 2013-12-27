package edu.univdhaka.iit.twitter.service;

import edu.univdhaka.iit.twitter.domain.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by Bazlur Rahman Rokon on 12/28/13.
 */
public class UserServiceImplTest {
    private UserService userService;

    private String FIRST_NAME = "Bazlur";
    private String LAST_NAME = "Rahman";
    private String EMAIL_ADDRESS = "anm_brr@yahoo.com";
    private String PASSEORD = "HXJD^%DAS";

    @Before
    public void setUp() throws Exception {
        System.out.println("setUp() ");
        userService = new UserServiceImpl();
    }

    @Test
    public void testCreateNewUser() throws Exception {
        User user = new User();
        user.setFirstName(FIRST_NAME);
        user.setLastName(LAST_NAME);
        user.setEmailAddress(EMAIL_ADDRESS);
        user.setPassword(PASSEORD);
        boolean userCreated = userService.createNewUser(user);
        Assert.assertEquals(true, userCreated);
    }

    @Test
    public void testFindAllUser() throws Exception {
        List<User> userList = userService.findAllUser();
        int count = userList.size();
        Assert.assertEquals(1, count);
    }
}
