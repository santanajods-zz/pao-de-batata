package ep2.ocd;

public class Decodificador {

    private char[] opcode;

    public void compilar(Comando c) {
        switch (c.getOpcode()) {
            case "mov": {
                opcode = "1110".toCharArray();
            }
            case "add": {
                opcode = "0001".toCharArray();
            }
            case "sub": {
                opcode = "0010".toCharArray();
            }
            case "mul": {
                opcode = "0011".toCharArray();
            }
            case "div": {
                opcode = "0100".toCharArray();
            }
            case "cmp": {
                opcode = "0101".toCharArray();
            }
            case "inc": {
                opcode = "0110".toCharArray();
            }
            case "jmp": {
                opcode = "0111".toCharArray();
            }
            case "je": {
                opcode = "1000".toCharArray();
            }
            case "jne": {
                opcode = "1001".toCharArray();
            }
            case "jg": {
                opcode = "1010".toCharArray();
            }
            case "jge": {
                opcode = "1011".toCharArray();
            }
            case "jl": {
                opcode = "1100".toCharArray();
            }
            case "jle": {
                opcode = "1101".toCharArray();
            }
            default:
                opcode = "".toCharArray();
        }
    }
}
