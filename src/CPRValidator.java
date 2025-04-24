public class CPRValidator {

    //TODO
    /// isValid metode der tager String som input
    /// valider streng for længde, over 10 eller under 10.
    /// valider formated DDMMYYXXXX
    // return boolean
    public boolean isValidLen(String str) {
        throw new RuntimeException("Not implemented yet");
    }

    //TODO
    /// isValidDate der tager den længde validered str fra is valid og
    /// validerer Dato for
    /// må ikke ligge i fremtiden
    /// Antag følgende: Hvis YY ≤ (nuværende år % 100), så er det 2000+YY Ellers er det 1900+YY
    // return boolean
    public boolean isValidDate(String str) {
        throw new RuntimeException("Not implemented yet");
    }

    //TODO
    /// isValidModulus er Modulus 11 validering
    /// Beregn en vægtet sum af CPR nr. med følgende vægte 4, 3, 2, 7, 6, 5, 4, 3, 2, 1
    /// Tjek om modulus 11 af den vægtet sum giver 0
    /// Eksempel:
    /// CPR NR: 1203045677
    /// Vægtet sum beregning:
    /// weightedSum = 1*4 + 2*3 + 0*2 + 3*7 + 0*6 + 4*5 + 5*4 + 6*3 + 7*2 + 7*1;
    /// Tjek om modulus 11 af den vægtet sum giver 0 (i så fald et gyldigt CPR)
    /// result = weightedSum % 11; // giver 0 => gyldigt CPR
    public boolean isValidModulus(String str) {
        throw new RuntimeException("Not implemented yet");
    }



}
