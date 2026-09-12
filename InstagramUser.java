public class InstagramUser {

    String username;
    String fullName;
    String bio;
    int followersCount;
    int followingCount;
    boolean isPrivate;

    public void postPhoto() {
        System.out.println(username + " successfully posted a photo! ");
    }

    public void sendDirectMessage(String receiver) {
        System.out.println(username + " sent a DM to " + receiver + " ");
    }

    public static void main(String[] args) {
        InstagramUser u1 = new InstagramUser();
        InstagramUser u2 = new InstagramUser();
        InstagramUser u3 = new InstagramUser();

        // 1st User Details
        u1.username = "coding_ninja";
        u1.fullName = "Ved Dangat";
        u1.bio = "Java Developer | Tech Enthusiast ";
        u1.followersCount = 1250;
        u1.followingCount = 450;
        u1.isPrivate = false;

        System.out.println("----------- 1st User Details --------------");
        System.out.println("Username: @" + u1.username);
        System.out.println("Name: " + u1.fullName);
        System.out.println("Bio: " + u1.bio);
        System.out.println("Followers: " + u1.followersCount);
        System.out.println("Following: " + u1.followingCount);
        System.out.println("Is Private Account: " + u1.isPrivate);
        
        u1.postPhoto();
        u1.sendDirectMessage("soham_h");
        System.out.println();



        // 2nd User Details
        u2.username = "soham_h";
        u2.fullName = "Soham Hanvate";
        u2.bio = "Traveler  | Foodie ";
        u2.followersCount = 3400;
        u2.followingCount = 820;
        u2.isPrivate = true;

        System.out.println("----------- 2nd User Details --------------");
        System.out.println("Username: @" + u2.username);
        System.out.println("Name: " + u2.fullName);
        System.out.println("Bio: " + u2.bio);
        System.out.println("Followers: " + u2.followersCount);
        System.out.println("Following: " + u2.followingCount);
        System.out.println("Is Private Account: " + u2.isPrivate);
        
        u2.postPhoto();
        System.out.println();




        // 3rd User Details
        u3.username = "siddhant_b";
        u3.fullName = "Siddhant Bhange";
        u3.bio = "Fitness Freak  | Stay Motivated";
        u3.followersCount = 890;
        u3.followingCount = 310;
        u3.isPrivate = false;

        System.out.println("----------- 3rd User Details --------------");
        System.out.println("Username: @" + u3.username);
        System.out.println("Name: " + u3.fullName);
        System.out.println("Bio: " + u3.bio);
        System.out.println("Followers: " + u3.followersCount);
        System.out.println("Following: " + u3.followingCount);
        System.out.println("Is Private Account: " + u3.isPrivate);
        
        // Triggering Actions for User 3
        u3.sendDirectMessage("coding_ninja");
    }
}