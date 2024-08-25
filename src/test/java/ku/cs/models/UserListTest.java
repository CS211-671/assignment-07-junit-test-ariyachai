package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Tonnam1", "Inwza1");
        userList.addUser("Tonnam2", "Inwza2");
        userList.addUser("Tonnam3", "Inwza3");

        // TODO: find one of them
        User user = userList.findUserByUsername("Tonnam1");

        // TODO: assert that UserList found User
        String expected = "Tonnam1";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Tonnam1", "Inwza1");
        userList.addUser("Tonnam2", "Inwza2");
        userList.addUser("Tonnam3", "Inwza3");

        // TODO: change password of one user
        boolean result = userList.changePassword("Tonnam1", "Inwza1", "Inwza001");
        assertTrue(result);

        // TODO: assert that user can change password
        User user = userList.findUserByUsername("Tonnam1");
        assertNotNull(user);
        assertTrue(user.validatePassword("Inwza001"));
        assertFalse(user.validatePassword("Inwza1"));
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Tonnam1", "Inwza1");
        userList.addUser("Tonnam2", "Inwza2");
        userList.addUser("Tonnam3", "Inwza3");

        // TODO: call login() with correct username and password
        User user = userList.login("Tonnam1", "Inwza1");

        // TODO: assert that User object is found
        String expected = "Tonnam1";
        String actual = user.getUsername();
        assertNotNull(user);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Tonnam1", "Inwza1");
        userList.addUser("Tonnam2", "Inwza2");
        userList.addUser("Tonnam3", "Inwza3");

        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("Tonnam1", "Inwza2");

        // TODO: assert that the method return null
        assertNull(actual);
    }

}