package animatefx.animation;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;

/**
 * @author Loïc Sculier
 */
public class BounceInLeft {

    /**
     * Create new BounceInLeft
     *
     * @param node The node to affect
     */
    public BounceInLeft(Node node) {
        BounceInLeft(node);
    }

    private void BounceInLeft(Node node) {
        double startX = -node.localToScene(0, 0).getX() - node.getBoundsInParent().getWidth();
        Timeline t =
                new Timeline(
                        new KeyFrame(Duration.millis(0),
                                new KeyValue(node.opacityProperty(), 0, Interpolator.SPLINE(0.215, 0.610, 0.355, 1.000)),
                                new KeyValue(node.translateXProperty(), startX, Interpolator.SPLINE(0.215, 0.610, 0.355, 1.000))
                        ),
                        new KeyFrame(Duration.millis(600),
                                new KeyValue(node.opacityProperty(), 1, Interpolator.SPLINE(0.215, 0.610, 0.355, 1.000)),
                                new KeyValue(node.translateXProperty(), 25, Interpolator.SPLINE(0.215, 0.610, 0.355, 1.000))
                        ),
                        new KeyFrame(Duration.millis(750),
                                new KeyValue(node.translateXProperty(), -10, Interpolator.SPLINE(0.215, 0.610, 0.355, 1.000))
                        ),
                        new KeyFrame(Duration.millis(900),
                                new KeyValue(node.translateXProperty(), 5, Interpolator.SPLINE(0.215, 0.610, 0.355, 1.000))
                        ),
                        new KeyFrame(Duration.millis(1000),
                                new KeyValue(node.translateXProperty(), 0, Interpolator.SPLINE(0.215, 0.610, 0.355, 1.000))
                        )

                );
        t.play();
    }
}
