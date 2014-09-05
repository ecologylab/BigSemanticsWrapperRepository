using System;
using Ecologylab.BigSemantics.Generated.Library.PrimitivesNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Simpl.Serialization;

namespace Ecologylab.BigSemantics.Generated
{
    public class RichMediaTypeScope
    {
        public static readonly string Name = "repository_media";

        protected static readonly Type[] Translations =
            {
                typeof (HtmlText),
                typeof (Image),
                typeof (WebVideo),
                typeof (Video),
                typeof (Audio)
            };

        public static SimplTypesScope Get()
        {
            return SimplTypesScope.Get(Name, Translations);
        }
    }
}
