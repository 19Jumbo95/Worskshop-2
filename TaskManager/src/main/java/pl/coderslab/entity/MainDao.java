package pl.coderslab.entity;

public class MainDao {
    public static void main(String[] args) {

        UserDao userDao = new UserDao();

/*        User user = new User();
        user.setUserName("Jan");
        user.setEmail("Jan@gmail1236.com");
        user.setPassword("Jan");
        userDao.create(user);

        User user1 = new User();
        user1.setUserName("Test");
        user1.setEmail("test@wp.pl");
        user1.setPassword("Test");
        userDao.create(user1);*/

        User user2 = new User();
        user2.setUserName("Nowy");
        user2.setEmail("nowy@wp.pl");
        user2.setPassword("test123");
        userDao.create(user2);

       /* User userExist = userDao.read(1);
        System.out.println(userExist.toString());

        User userNotExist = userDao.read(2);
        System.out.println(userNotExist);

        User userUpdate = userDao.read(1);
        userUpdate.setEmail("Maciek1995@wp.pl");
        userUpdate.setPassword("nowehasło123");
        userUpdate.setUserName("nowyMaciek");
        userDao.update(userUpdate);*/

        // userDao.delete(5);


        /*UserDao userDao = new UserDao();
        User[] arrOfUser = userDao.findAll();
        for (User user1 : arrOfUser) {
            System.out.println(user1.toString());
        }*/

    }
}
