public class TipoSoftwareQA implements TipoSoftware {
    private static TipoSoftwareQA qa = new TipoSoftwareQA();

    private TipoSoftwareQA(){};

    public static TipoSoftwareQA getTipoSoftwareQA(){
        return qa;
    }

}
