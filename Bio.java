public class Bio {
    public String dnaToRna(String dna) {
        StringBuilder rna = new StringBuilder();
        for (int i = 0; i < dna.length(); i++) {
            char nucleotide = dna.charAt(i);
            if (nucleotide == 'T') {
                rna.append('U');
            } else {
                rna.append(nucleotide);
            }
        }
        return rna.toString();
    }
}