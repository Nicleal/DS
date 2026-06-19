public class Icms implements IImposto {

    @Override
    public double calcular(double valor) {
        return valor * 0.18;
    }

}