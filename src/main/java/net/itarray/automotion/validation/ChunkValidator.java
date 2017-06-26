package net.itarray.automotion.validation;

import org.openqa.selenium.WebElement;

public interface ChunkValidator {

    ChunkValidator drawMap();

    ChunkValidator dontDrawMap();

    boolean validate();

    /**
     * @deprecated As of release 2.0, replaced by {@link net.itarray.automotion.validation.ChunkValidator#changeMetricsUnitsTo(Units)}
     */
    @Deprecated
    ChunkValidator changeMetricsUnitsTo(util.validator.ResponsiveUIValidator.Units units);

    ChunkValidator changeMetricsUnitsTo(Units units);

    ChunkValidator alignedAsGrid(int horizontalGridSize);

    ChunkValidator alignedAsGrid(int horizontalGridSize, int verticalGridSize);

    ChunkValidator areNotOverlappedWithEachOther();

    ChunkValidator withSameSize();

    ChunkValidator withSameWidth();

    ChunkValidator withSameHeight();

    ChunkValidator withNotSameSize();

    ChunkValidator withNotSameWidth();

    ChunkValidator withNotSameHeight();

    ChunkValidator sameRightOffset();

    ChunkValidator sameLeftOffset();

    ChunkValidator sameTopOffset();

    ChunkValidator sameBottomOffset();

    ChunkValidator equalLeftRightOffset();

    ChunkValidator equalTopBottomOffset();

    ChunkValidator insideOf(WebElement containerElement, String readableContainerName);

}