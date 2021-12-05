package sec06.Exercise;

public class ShopService {
    //정적 필드
    private static ShopService shopService = new ShopService();

    //생성자
    private ShopService() {}

    //정적 메소드
    public static ShopService getInstance() {
        return shopService;
    }
}
