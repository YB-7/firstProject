package co.friend.access;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import co.friend.model.Friend;

// FriendAccess(인터페이스) 구현하는 객체
// 파일에 저장
public class FriendList implements FriendAccess {

	String path = "c:/tmp/friendList.txt";
	Friend[] friends;

	public void open() {
		File file = new File(path);
		if (!file.exists()) { // path에 해당 파일이 없으면 디렉토리/파일 샹성
			File dir = new File("c:/tmp/");
			dir.mkdirs();// c:/tmp 디렉토리 생성
			try {
				file.createNewFile(); // 파일을 생성
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			Scanner scn = new Scanner(file); // file에 있는 값을 한번에 다 읽어옴
			while (true) {
				if (!scn.hasNext()) {
					break;
				}
				String readStr = scn.next();
				String[] arr = readStr.split(",");

				Friend friend = new Friend(arr[0], arr[1], arr[2]);

				// 배열의 빈공간에 한건씩 저장
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = friend;
						break;
					}
				}
			}
			scn.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void save() {
		BufferedWriter br = null;
		try {
			br = new BufferedWriter(new FileWriter(path));
			for (int i = 0; i < friends.length; i++) { // 배열에 있는 데이터를 쓰기
				if (friends[i] != null) {
					br.write(String.format("%s,%s,%s\n", friends[i].getGubun(), friends[i].getName(),
							friends[i].getTel()));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public FriendList() {
		friends = new Friend[10];
		open();
	}

	@Override
	public void insert(Friend friend) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
		save();
	}

	@Override
	public void update(Friend friend) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(friend.getName())) {
				friends[i].setTel(friend.getTel());
				break;
			}
		}
		save();
	} // End of update();

	@Override
	public void delete(String name) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(name)) {
				friends[i] = null;
				break;
			}
		}
		save();
	}

	@Override
	public Friend[] selectAll() {
		return friends;
	}

	@Override
	public Friend selectOne(String name) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(name)) {
				return friends[i];
			}
		}
		return null;
	}

	@Override
	public Friend findTel(String tel) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getTel().equals(tel)) {
				return friends[i];
			}
		}
		return null;
	}
}
