package ecologylab.bigsemantics;

import ecologylab.bigsemantics.generated.library.primitives.WebVideo;
import ecologylab.bigsemantics.metadata.builtins.Audio;
import ecologylab.bigsemantics.metadata.builtins.HtmlText;
import ecologylab.bigsemantics.metadata.builtins.Image;
import ecologylab.bigsemantics.metadata.builtins.Video;
import ecologylab.serialization.SimplTypesScope;

public class RichMediaTypeScope 
{
	public static final String SCOPE_NAME = "repository_media";

    protected static final Class[] TRANSLATIONS =
        {
            WebVideo.class,
            HtmlText.class,
            Image.class,
            Video.class,
            Audio.class
        };

    public static SimplTypesScope get()
    {
        return SimplTypesScope.get(SCOPE_NAME, TRANSLATIONS);
    }
}
