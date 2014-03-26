/**
 * 
 */
package ecologylab.bigsemantics;

import ecologylab.bigsemantics.generated.library.primitives.VideoClipping;
import ecologylab.bigsemantics.generated.library.primitives.WebVideo;
import ecologylab.bigsemantics.metadata.builtins.Audio;
import ecologylab.bigsemantics.metadata.builtins.Clipping;
import ecologylab.bigsemantics.metadata.builtins.HtmlText;
import ecologylab.bigsemantics.metadata.builtins.Image;
import ecologylab.bigsemantics.metadata.builtins.ImageClipping;
import ecologylab.bigsemantics.metadata.builtins.ImageSelfmade;
import ecologylab.bigsemantics.metadata.builtins.RichArtifact;
import ecologylab.bigsemantics.metadata.builtins.TextClipping;
import ecologylab.bigsemantics.metadata.builtins.TextSelfmade;
import ecologylab.bigsemantics.metadata.builtins.Video;
import ecologylab.serialization.SimplTypesScope;

/**
 * @author andrew
 *
 */
public class RichArtifactsTypeScope {

	public static final String SCOPE_NAME = "rich_artifacts_scope";

    protected static final Class[] TRANSLATIONS =
        {
            RichArtifact.class,
            Clipping.class,
            ImageClipping.class,
            TextClipping.class,
            VideoClipping.class,
            ImageSelfmade.class,
            TextSelfmade.class,
        };

    public static SimplTypesScope get()
    {
        return SimplTypesScope.get(SCOPE_NAME, RichMediaTypeScope.get(), TRANSLATIONS);
    }
}
