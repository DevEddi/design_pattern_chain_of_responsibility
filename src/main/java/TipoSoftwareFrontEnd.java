public class TipoSoftwareFrontEnd implements TipoSoftware {
    private static TipoSoftwareFrontEnd frontEnd = new TipoSoftwareFrontEnd();

    private TipoSoftwareFrontEnd(){};

    public static TipoSoftwareFrontEnd getTipoSoftwareFrontEnd(){
        return frontEnd;
    }


}
