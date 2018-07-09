//the test class simulating a user using a forum
public class TestConnection {

	public static void main(String[] args) {
		
		Post p1 = new Post();
		Post p2 = new Post();
		Post p3 = new Post();
		Connection c1 = new Connection();
		
		Command ConnectToServer = new ConnectToServer(c1);
		Command DisconnectToServer = new DisconnectToServer(c1);
		Command MakeAPost = new MakeAPost(p1);
		Command DeleteAPost = new DeleteAPost(p1);
		Command EditAPost = new EditAPost(p1);
		Command AddASignature = new AddASignature(p1);
		Command MakeAPost2 = new MakeAPost(p2);
		Command EditAndSign = new EditAndSign(p2);
		Command MakeAndSign = new MakeAndSign(p3);
		
		ConnectToServer.execute();
		MakeAPost.execute();
		EditAPost.execute();
		AddASignature.execute();
		DeleteAPost.execute();
		MakeAPost2.execute();
		EditAndSign.execute();
		MakeAndSign.execute();
		DisconnectToServer.execute();
		
	}

}
