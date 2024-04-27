package Factory;


public class UiFactoryFactory {
    public static UIFactory getUIFactoryByPlatform(SupportedPlatforms platform){
        return switch(platform){
            case IOS -> new IosUiFactory();
            case ANDROID -> new AndroidUiFactory();
            case WEB ->  new WebUiFactory();
        };
    }
}