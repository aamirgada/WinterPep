class DownloadTask extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Downloading file... " + i);
        }
    }
}

class MusicTask extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Playing music... " + i);
        }
    }
}

