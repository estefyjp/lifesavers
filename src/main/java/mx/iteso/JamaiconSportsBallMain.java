package mx.iteso;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.balls.AmericanFootballBall;
import mx.iteso.strategy.balls.BaseballBall;
import mx.iteso.strategy.balls.BasketballBall;
import mx.iteso.strategy.balls.GolfBall;
import mx.iteso.strategy.balls.PingPongBall;
import mx.iteso.strategy.balls.SoccerBall;
import mx.iteso.strategy.balls.TennisBall;
import mx.iteso.strategy.balls.VolleyballBall;

public class JamaiconSportsBallMain {
    public static void main (String[] args) {
        Ball soccer = new SoccerBall();
        Ball base = new BaseballBall();
        Ball american = new AmericanFootballBall();
        Ball basket = new BasketballBall();
        Ball golf = new GolfBall();
        Ball PingPong = new PingPongBall();
        Ball tennis = new TennisBall();
        Ball volley = new VolleyballBall();

        System.out.println(soccer.roll());
        System.out.println(soccer.performBounce());
        System.out.println(soccer.performDeflate());
        System.out.println(soccer.performInflate());
        System.out.println(soccer.performFloat());
        System.out.println(soccer.performSink());
        //soccer.setBehavior(new NormalBounce());



        System.out.println();

        System.out.println(american.roll());
        System.out.println(american.performBounce());
        System.out.println(american.performDeflate());
        System.out.println(american.performInflate());
        System.out.println(soccer.performFloat());
        System.out.println(soccer.performSink());
        //american.setBehavior(new NormalBounce());

        System.out.println();

        System.out.println(base.roll());
        System.out.println(base.performBounce());
        System.out.println(base.performDeflate());
        System.out.println(base.performInflate());
        System.out.println(soccer.performFloat());
        System.out.println(soccer.performSink());


        System.out.println();
        
        System.out.println(basket.roll());
        System.out.println(basket.performBounce());
        System.out.println(basket.performDeflate());
        System.out.println(basket.performInflate());
        System.out.println(basket.performFloat());
        System.out.println(basket.performSink());
        
        System.out.println();
        
        System.out.println(golf.roll());
        System.out.println(golf.performBounce());
        System.out.println(golf.performDeflate());
        System.out.println(golf.performInflate());
        System.out.println(golf.performFloat());
        System.out.println(golf.performSink());
        
        System.out.println();
        
        System.out.println(PingPong.roll());
        System.out.println(PingPong.performBounce());
        System.out.println(PingPong.performDeflate());
        System.out.println(PingPong.performInflate());
        System.out.println(PingPong.performFloat());
        System.out.println(PingPong.performSink());

        System.out.println();
        
        System.out.println(tennis.roll());
        System.out.println(tennis.performBounce());
        System.out.println(tennis.performDeflate());
        System.out.println(tennis.performInflate());
        System.out.println(tennis.performFloat());
        System.out.println(tennis.performSink());
        
        System.out.println();
        
        System.out.println(volley.roll());
        System.out.println(volley.performBounce());
        System.out.println(volley.performDeflate());
        System.out.println(volley.performInflate());
        System.out.println(volley.performFloat());
        System.out.println(volley.performSink());

        
    }
}
