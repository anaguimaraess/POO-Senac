public class Jogador {
    private String nome;
    private int xp = 0;
    private int hp = 100;
    private boolean envenenado = false;

    public Jogador() {
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public int getXp() {
        return xp;
    }

    public int getHp() {
        return hp;
    }

    public boolean isEnvenenado() {
        return envenenado;
    }

    public void receberDano(int pontos) {
        this.hp -= pontos;
    }

    public void receberCura(int pontos) {
        this.hp += pontos;
    }

    public void ganharExperiencia(int pontos) {
        this.xp += pontos;
    }

    public void receberAntidoto() {
        if (this.envenenado == false) {
            this.envenenado = true;
            return;
        }
        this.envenenado = false;
    }
}
