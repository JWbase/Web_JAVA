package kh.java.word.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import kh.java.word.view.WordView;

public class WordController {
	private ArrayList<String> words;
	private WordView view;
	private Random r;
	private int win;
	private int lose;

	public WordController() {
		super();
		words = new ArrayList<String>();
		getWordFile();
		r = new Random();
		view = new WordView();
	}

	public void main() {

		while (true) {
			int sel = view.showMenu();
			switch (sel) {
			case 1:
				startGame();
				break;
			case 2:
				break;
			case 0:
				return;
			default:
				break;
			}
		}
	} // end main

	public void startGame() {
		//1. words리스트에서 랜덤단어 1개 추출
		int random = r.nextInt(words.size());
		String word = words.get(random);
		view.startGame();
		view.comTurn(word);
		while (true) {
			char lastLetter = word.charAt(word.length() - 1);
			String userWord = view.userTurn(lastLetter);
			int userResult = checkWord(userWord, lastLetter);
			if (userResult == -1) {
				return;
			} else if (userResult == 1) {
				continue;
			}
			char userLastLetter = userWord.charAt(userWord.length() - 1);
			word = comTurn(userLastLetter);
			if (word == null) {
				win++;
				view.winMsg();
				return;
			} else {
				view.comTurn(word);
			}
		}
	} // startGame() end

	private String comTurn(char lastLetter) {

		ArrayList<String> list = new ArrayList<String>();
		for (String word : words) {
			char firstLetter = word.charAt(0);
			if (firstLetter == lastLetter) {
				list.add(word);
			}
		}
		if (list.isEmpty()) {
			return null;
		} else {
			int random = r.nextInt(list.size());
			String word = list.get(random);
			return word;
		}

		//1. 문자열을 저장할 ArrayList생성
		//2. words중에 사용자가 입력한 마지막글로 시작하는 단어를 생성한 리스트에 add
		// 만약 마지막글자로 시작하는 단어가 한개도 없으면 -> return null;
		// 단어가 있으면 단어 중 랜덤단어 1개 리턴

	}

	public int checkWord(String userWord, char lastLetter) {
		//1. gg입력한 경우 -> return -1
		//2. 정상인경우 -> 이전단어 끝글자와 입력단어 첫글자가 일치
		//-> 입력한 단어가 words에 존재하는 경우
		//-> 위 두가지 조건 모두 만족하는 경우 return 0
		//3. 비정상인경우
		// 3-1. 이전단어끝글자와, 입력단어 첫글자가 다른경우
		// 3-2. 이전단어 끝글자와, 입력단어 첫글자는 같은데 입력단어가 words에 존재하지 않는 경우
		// -> return 1
		if (userWord.equals("gg")) {
			view.loseMsg();
			lose++;
			return -1;
		}
		char firstLetter = userWord.charAt(0);
		if (firstLetter == lastLetter) {
			if (words.contains(userWord)) {
				return 0;
			} else {
				view.noSearchWord();
				return 1;
			}
		} else {
			view.wrongMsg();
			return 1;
		}
	}

	private void getWordFile() {
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader("words.txt");
			br = new BufferedReader(fr);
			while (true) {
				String word = br.readLine();
				if (word == null) {
					break;
				}
				words.add(word);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}