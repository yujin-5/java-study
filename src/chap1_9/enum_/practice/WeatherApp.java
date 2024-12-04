package chap1_9.enum_.practice;

public class WeatherApp {

    private Weather status;

    public Weather getAdvice(){
        return this.status;
    }

    public void sunny(){
        this.status = Weather.SUNNY;
        System.out.println("선크림을 바르세요.");
    }

    public void cloudy(){
        this.status = Weather.CLOUDY;
        System.out.println("우산을 챙기세요.");
    }

    public void rainy(){
        this.status = Weather.RAINY;
        System.out.println("비가 오니 우산을 꼭 챙기세요.");
    }

    public void snowy(){
        this.status = Weather.SNOWY;
        System.out.println("따뜻하게 입으세요.");
    }

}
