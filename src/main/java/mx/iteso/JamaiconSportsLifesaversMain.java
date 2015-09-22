package mx.iteso;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.lifesavers.ArmBands;
import mx.iteso.strategy.lifesavers.SwimRing;
import mx.iteso.strategy.lifesavers.SwimSeat;

public class JamaiconSportsLifesaversMain {
        public static void main (String[] args) {
            Lifesaver foamFloats = new SwimRing();
            Lifesaver swimRing = new SwimRing();
            Lifesaver swimSeat = new SwimSeat();
            Lifesaver armBands = new ArmBands();
            Lifesaver lifeSaversCandies = new SwimRing();
            Lifesaver lifeVests = new SwimRing();
            Lifesaver swimBelts = new SwimRing();
            Lifesaver waterTubes = new SwimRing();

            System.out.println(swimRing.display());
            System.out.println(swimRing.performInflate());
            System.out.println(swimRing.performDeflate());
            System.out.println(swimRing.performFloat());
            System.out.println(swimRing.performSink());


            System.out.println();

            System.out.println(swimSeat.display());
            System.out.println(swimSeat.performInflate());
            System.out.println(swimSeat.performDeflate());
            System.out.println(swimSeat.performFloat());
            System.out.println(swimSeat.performSink());


            System.out.println();

            System.out.println(armBands.display());
            System.out.println(armBands.performInflate());
            System.out.println(armBands.performDeflate());
            System.out.println(armBands.performFloat());
            System.out.println(armBands.performSink());

            
            System.out.println();

            System.out.println(foamFloats.display());
            System.out.println(foamFloats.performInflate());
            System.out.println(foamFloats.performDeflate());
            System.out.println(foamFloats.performFloat());
            System.out.println(foamFloats.performSink());

            
            System.out.println();

            System.out.println(lifeSaversCandies.display());
            System.out.println(lifeSaversCandies.performInflate());
            System.out.println(lifeSaversCandies.performDeflate());
            System.out.println(lifeSaversCandies.performFloat());
            System.out.println(lifeSaversCandies.performSink());

            
            System.out.println();

            System.out.println(lifeVests.display());
            System.out.println(lifeVests.performInflate());
            System.out.println(lifeVests.performDeflate());
            System.out.println(lifeVests.performFloat());
            System.out.println(lifeVests.performSink());

            
            System.out.println();

            System.out.println(swimBelts.display());
            System.out.println(swimBelts.performInflate());
            System.out.println(swimBelts.performDeflate());
            System.out.println(swimBelts.performFloat());
            System.out.println(swimBelts.performSink());

            
            System.out.println();

            System.out.println(waterTubes.display());
            System.out.println(waterTubes.performInflate());
            System.out.println(waterTubes.performDeflate());
            System.out.println(waterTubes.performFloat());
            System.out.println(waterTubes.performSink());

            
        }
}
