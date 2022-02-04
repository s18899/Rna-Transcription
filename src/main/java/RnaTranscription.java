class RnaTranscription {

    String transcribe(String dnaStrand) {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String RnaTranscription = "";
        
        RnaTranscription = "";
        for (int i = 0;i < dnaStrand.length();i++)
        {
            if(dnaStrand.charAt(i) == 'G')
                RnaTranscription += "C";
            else if(dnaStrand.charAt(i) == 'C')
                RnaTranscription += "G";
            else if(dnaStrand.charAt(i) == 'T')
                RnaTranscription += "A";
            else if(dnaStrand.charAt(i) == 'A')
                RnaTranscription += "U";

        }
        return RnaTranscription;
    }
}
