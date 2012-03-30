package org.tfl.seg;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

//import java.io.File;
//import java.io.IOException;
//import java.net.UnknownHostException;
//import java.util.Set;
//
//import com.mongodb.DB;
//import com.mongodb.DBCollection;
//import com.mongodb.DBCursor;
//import com.mongodb.Mongo;
//import com.mongodb.MongoException;

public class TFL {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MainView view = new MainView("Steven Gleed - TFL Stats");
				view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				view.setVisible(true);
			}
		});
		
//		SwingUtilities.invokeLater(new Runnable() {
//			public void run() {
//				PasswordView view = new PasswordView("Steven Gleed - TFL Stats");
//				view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//				view.setVisible(true);
//			}
//		});
		
//		File d = new File(".");
//		try {
//			System.out.println(d.getCanonicalPath());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		CsvOperation csv = new CsvOperation();
//		csv.open("tfl1.csv");
		
//		try {
//			Mongo m = new Mongo("ds029817.mongolab.com", 29817);
//			DB db = m.getDB("steve_srwc");
//			char[] pass = new char[] {'s','k','u','n','k','p','u','s','s','y'};
//			boolean authed = db.authenticate("steven", pass);
//			
//			if (authed) {
//				System.out.println("authed ok");
//			}
//			else
//			{
//				System.out.println("not authed");
//			}
//			
////			Set<String> dbs = db.getCollectionNames();
////			for (String s : dbs) {
////				System.out.print(s + " ");
////			}
//			
//			DBCollection collection = db.getCollection("srwc_player");
//			DBCursor cur = collection.find();
//			while (cur.hasNext()) {
//				System.out.println("next" + cur.next());
//			}
//			
////			if (dbs.contains("steve_tfl")) {
////				dbs.
////				System.out.println("\ncontains steve_tfl");
////			}
//		} catch (UnknownHostException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (MongoException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
	}

}
