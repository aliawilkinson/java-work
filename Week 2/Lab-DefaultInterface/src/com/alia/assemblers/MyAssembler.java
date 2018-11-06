package com.alia.assemblers;

import com.alia.interfaces.Packager;
import com.alia.model.Color;
import com.alia.model.Content;
import com.alia.model.Dimension;
import com.alia.model.Package;

public class MyAssembler implements Packager {
    private static int packageCount = 0;

    public MyAssembler() {
        packageCount++;
    }

    @Override
    public Package assemblePackage() {
        Content content = new Content(packageCount, "New Grey Package: " + packageCount);
        Color color = new Color(125, 125, 125);
        Dimension dimension =  new Dimension(5,5,5);

        return new Package(content, color, dimension);
    }
}