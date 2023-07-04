package controller;

import service.JSONHandler;

import java.net.http.HttpClient;

public interface Controller {
    final String URL = "https://charts.yandex-team.ru/api/run";
    final String FILE_PATH_RESULT = "D:\\JavaCoding\\DataLensImporter\\result.txt";
    final String FILE_PATH_2_LINE = "D:\\JavaCoding\\DataLensImporter\\2line.json";
    final String FILE_PATH_3_LINE = "D:\\JavaCoding\\DataLensImporter\\3line.json";
    final String FILE_PATH_CHATS = "D:\\JavaCoding\\DataLensImporter\\chats.json";
    final String FILE_PATH_2_LINE_LW = "D:\\JavaCoding\\DataLensImporter\\2lineLW.json";
    final String FILE_PATH_3_LINE_LW = "D:\\JavaCoding\\DataLensImporter\\3lineLW.json";
    final String FILE_PATH_CHATS_LW = "D:\\JavaCoding\\DataLensImporter\\chatsLW.json";
    final String FILE_PATH_CHATS_COUNT = "D:\\JavaCoding\\DataLensImporter\\chatscount.json";
    final String FILE_PATH_CHATS_COUNT_LW = "D:\\JavaCoding\\DataLensImporter\\chatscountLW.json";
    final String TOKEN = "y1_AQAD-qJSKVX6AAAKwwAAAAAANsNjxmOirKPxTaG9q8IBVj7OnFkKvWo";
    JSONHandler jsonHandler = new JSONHandler();
    HttpClient client = HttpClient.newHttpClient();
}
