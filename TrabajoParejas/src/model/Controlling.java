package model;

public class Controlling{

    ArrayList<Neornithes> listNeornithes;

    public boolean checkName(String name){

        boolean information = true;

        for(int i = 0 ; i <= listNeornithes.size() ; i++){

            String nameCheck = listNeornithes.get(i).getName();

            if( nameCheck == name){

                information = false;
                i+=listNeornithes.size();

            }


        }

        return information;

    }


    public String createGalloanserae(String name, ArrayList senses, double tailLength, double bonesDensity, String metabolicRange, double thirdToeLength, int numberOfLegBones, String reproductionType, String lifeType){

        String information = "El ave galloanserae no fue creado./n";

        if(checkName(name) == true){

            information = "El ave galloanserae fue creado./n";
            Neornithes bird = new Galloanserae(name, senses, tailLength, bonesDensity, metabolicRange, thirdToeLength, numberOfLegBones, reproductionType, lifeType);
            listNeornithes.add(bird);

        }

        return information;

    }

    public String createNeoBird(String name, ArrayList senses, double tailLength, double bonesDensity, String metabolicRange, double thirdToeLength, int numberOfLegBones, int numberOfLegs, int numberOfToes){

        String information = "El ave neoave no fue creado./n";

        if(checkName(name) == true){

            information = "El ave neoave fue creado./n";
            Neornithes bird = new NeoBirds(name, senses, tailLength, bonesDensity, metabolicRange, thirdToeLength, numberOfLegBones, numberOfLegs, numberOfToes);
            listNeornithes.add(bird);

        }

        return information;
        
    }

    public String createNeognato(String name, ArrayList senses, double tailLength, double bonesDensity, String metabolicRange, double thirdToeLength, int numberOfLegBones){

        String information = "El ave neognato no fue creado./n";

        if(checkName(name) == true){

            information = "El ave neognato fue creado./n";
            Neornithes bird = new Neognato(name, senses, tailLength, bonesDensity, metabolicRange, thirdToeLength, numberOfLegBones);
            listNeornithes.add(bird);

        }

        return information;
        
    }

    public String createTinamues(String name, ArrayList senses, double tailLength, double bonesDensity, String metabolicRange, int palateBones, double speedOnEarth){

        String information = "El ave tinamue no fue creado./n";

        if(checkName(name) == true){

            information = "El ave tinamue fue creado./n";
            Neornithes bird = new Tinamues(name, senses, tailLength, bonesDensity, metabolicRange, palateBones, speedOnEarth);
            listNeornithes.add(bird);

        }

        return information;
        
    }

    public String createRatites(String name, ArrayList senses, double tailLength, double bonesDensity, String metabolicRange, int palateBones, boolean quilla){

        String information = "El ave ratite no fue creado./n";

        if(checkName(name) == true){

            information = "El ave ratite fue creado./n";
            Neornithes bird = new Ratites(name, senses, tailLength, bonesDensity, metabolicRange, palateBones, quilla);
            listNeornithes.add(bird);

        }

        return information;
        
    }

    public String createPaleognato(String name, ArrayList senses, double tailLength, double bonesDensity, String metabolicRange, int palateBones){

        String information = "El ave paleognato no fue creado./n";

        if(checkName(name) == true){

            information = "El ave paleognato fue creado./n";
            Neornithes bird = new Paleognato(name, senses, tailLength, bonesDensity, metabolicRange, palateBones);
            listNeornithes.add(bird);

        }

        return information;
        
    }

    public String getInformationTotal(){

        double speedOnEarth;
        boolean quilla;
        int palateBones;
        String reproductionType;
        String lifeType;
        int numberOfLegs;
        int numberOfToes;
        String name;
        ArrayList senses;
        double tailLength;
        double bonesDensity;
        String metabolicRange;
        double thirdToeLength;
        int numberOfLegBones;
        String information = "";

        for(int i = 0; i<=listNeornithes;i++){

            if(listNeornithes.get(i) instanceof Galloanserae){

                name = listNeornithes.get(i).getName();
                tailLength = listNeornithes.get(i).getTailLength();
                bonesDensity = listNeornithes.get(i).getBonesDensity();
                metabolicRange = listNeornithes.get(i).getMetabolicRange();
                Neognato bird = (Neognato) listNeornithes.get(i);
                thirdToeLength = bird.getThirdToeLength();
                numberOfLegBones = bird.getNumberOfLegBones();
                Galloanserae helper = (Galloanserae) bird;
                reproductionType = helper.getReproductionType();
                lifeType = helper.getLifeType();
                senses = helper.getSenses();

                information = information+"nombre: "+name+
                "/nlongitud de la cola: "+tailLength+
                "/nDensidad de los huesos: "+bonesDensity+
                "/nRango metabólico: "+metabolicRange+
                "/nlongitud del tercer dedo del pie: "+thirdToeLength+
                "/ncantidad de huesos de la pierna: "+numberOfLegBones+
                "/nTipo de reproducción: "+reproductionType+
                "/nlifeType : "+lifeType+
                "/nSentidos desarrollados: "+senses;

            }

        }
        


    }

}