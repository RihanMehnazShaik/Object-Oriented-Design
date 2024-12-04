public class Main {
    public static void main(String[] args) {
        User user1=new User("miniMelomaniac","Mehnaz","mehnazshaik@gmail.com");
        User user2=new User("adhyavi","Modi","modi@gmail.com");
        User user3=new User("niniman","Ninaad","ninaad@gmail.com");
        user1.follow(user2);
        PrivacySetting privacySetting=new PrivacySetting();
        privacySetting.addAllowedUser(user2);
        user1.createPost("my cat photo",privacySetting);
        user1.createPost("diwali dump",privacySetting);
        Post post1=user1.getPosts().get(0);
        System.out.println(post1.getContent()+" posted by: "+post1.getOwner().getName());
        System.out.println("Is Ninaad allowed? "+ post1.isVisible(user3));
        System.out.println("Is Ashyavi allowed? "+post1.isVisible(user2));
        Group group=new Group(user2,"Java enthusiasts");
        group.addMember(user1);
        Page page=new Page(user1,"Joy of computing with python");
        page.addMember(user2);
        group.postUpdate("I love java",user1);
        page.postUpdate("I love python",user1);
    }
}