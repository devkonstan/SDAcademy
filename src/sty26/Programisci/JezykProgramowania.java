package sty26.Programisci;

public enum JezykProgramowania {
    JAVA("java"),
    PYTHON("python"),
    C("c"),
    CPLUSPLUS("c++"),
    CSHARP("c#"),
    JAVASCRIPT("js"),
    PHP("php");

    private String nazwaKodowa;

    public void setNazwaKodowa(String nazwaKodowa) {
        this.nazwaKodowa = nazwaKodowa;
    }

    JezykProgramowania(String nazwaKodowa) {
        this.nazwaKodowa = nazwaKodowa;
    }



}

