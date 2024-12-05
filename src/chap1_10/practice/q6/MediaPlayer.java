package chap1_10.practice.q6;

public class MediaPlayer {

    private MediaPlayable[] mediaList;
    //배열 기본값: null
    //그래서 생성자에 빈 객체를 만들어주는 코드를 넣어줘야 함
    //private 제한자: 배열을 숨겨놔서 배열의 크기를 변경시키거나 삭제하는 것을 막아둠

    public MediaPlayer() {
        this.mediaList = new MediaPlayable[]{};
    }

    public void addMedia (MediaPlayable media){
        MediaPlayable[] temp = new MediaPlayable[mediaList.length+1];
        for (int i = 0; i < mediaList.length ; i++) {
            temp[i] = mediaList[i];
        }
        temp[temp.length-1]= media;
        mediaList = temp;
    }

    public void playAll(){
        for (MediaPlayable media : mediaList) {
            media.play();
        }
    }

}
//인터페이스가 어렵다?
//상속과 다형성을 제대로 학습 안 했기 때문...