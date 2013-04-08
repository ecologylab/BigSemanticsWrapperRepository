
using Ecologylab.Collections;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;


using Crit.Semantics.Generated.Txtf1.Fieldreports.EmergentEvent;
using Crit.Semantics.Generated.Txtf1.Fieldreports.Spotrep;
using Ecologylab.Semantics.Generated.Library.AcmNS;
using Ecologylab.Semantics.Generated.Library.ArtworkNS;
using Ecologylab.Semantics.Generated.Library.BibManagingNS;
using Ecologylab.Semantics.Generated.Library.BlogNS;
using Ecologylab.Semantics.Generated.Library.BuzzNS;
using Ecologylab.Semantics.Generated.Library.CameraNS;
using Ecologylab.Semantics.Generated.Library.CartoonNS;
using Ecologylab.Semantics.Generated.Library.CiteulikeNS;
using Ecologylab.Semantics.Generated.Library.CreativeWorkNS;
using Ecologylab.Semantics.Generated.Library.DleseNS;
using Ecologylab.Semantics.Generated.Library.FastflipNS;
using Ecologylab.Semantics.Generated.Library.FlickrNS;
using Ecologylab.Semantics.Generated.Library.GisNS;
using Ecologylab.Semantics.Generated.Library.GoogleBookNS;
using Ecologylab.Semantics.Generated.Library.GrantNS;
using Ecologylab.Semantics.Generated.Library.HotelNS;
using Ecologylab.Semantics.Generated.Library.IcdlNS;
using Ecologylab.Semantics.Generated.Library.IeeeXploreNS;
using Ecologylab.Semantics.Generated.Library.ImdbNS;
using Ecologylab.Semantics.Generated.Library.LolzNS;
using Ecologylab.Semantics.Generated.Library.MiscNS;
using Ecologylab.Semantics.Generated.Library.MovieNS;
using Ecologylab.Semantics.Generated.Library.NsdlNS;
using Ecologylab.Semantics.Generated.Library.NsfNS;
using Ecologylab.Semantics.Generated.Library.OpmlNS;
using Ecologylab.Semantics.Generated.Library.PatentNS;
using Ecologylab.Semantics.Generated.Library.PersonNS;
using Ecologylab.Semantics.Generated.Library.ProductAndServiceNS;
using Ecologylab.Semantics.Generated.Library.PublicationNS;
using Ecologylab.Semantics.Generated.Library.PubmedNS;
using Ecologylab.Semantics.Generated.Library.RestaurantNS;
using Ecologylab.Semantics.Generated.Library.RichBookmarkNS;
using Ecologylab.Semantics.Generated.Library.RssNS;
using Ecologylab.Semantics.Generated.Library.RwandatribunalNS;
using Ecologylab.Semantics.Generated.Library.ScholarlyArticleNS;
using Ecologylab.Semantics.Generated.Library.ScienceDirectNS;
using Ecologylab.Semantics.Generated.Library.SearchNS;
using Ecologylab.Semantics.Generated.Library.SlashdotNS;
using Ecologylab.Semantics.Generated.Library.SocialMediaNS;
using Ecologylab.Semantics.Generated.Library.TravelNS;
using Ecologylab.Semantics.Generated.Library.TripAdvisorNS;
using Ecologylab.Semantics.Generated.Library.TumblrNS;
using Ecologylab.Semantics.Generated.Library.TvShowNS;
using Ecologylab.Semantics.Generated.Library.UrbanspoonNS;
using Ecologylab.Semantics.Generated.Library.UvaNS;
using Ecologylab.Semantics.Generated.Library.VideoNS;
using Ecologylab.Semantics.Generated.Library.WikipediaNS;
using Ecologylab.Semantics.Generated.Library.YelpNS;
using Ecologylab.Semantics.MetadataNS.Builtins.Declarations;

// Developer should proof-read this TranslationScope before using it for production.
namespace Ecologylab.Semantics.Generated.Library 
{
	public class RepositoryMetadataTranslationScope
	{
		public RepositoryMetadataTranslationScope()
		{ }

		public static SimplTypesScope Get()
		{
			return SimplTypesScope.Get("repository_metadata", MetadataBuiltinsTypesScope.Get(),
				typeof(AcmPortal),
				typeof(AcmPortalAuthor),
				typeof(AcmPortalAuthorCollaborators),
				typeof(AcmPortalAuthorPublicationDetail),
				typeof(AcmPortalInstitutionProfile),
				typeof(AcmPortalPeriodical),
				typeof(AcmPortalSearch),
				typeof(AcmPortalSearchResult),
				typeof(AdditionalMetadata),
				typeof(AmazonBook),
				typeof(AmazonList),
				typeof(AmazonProduct),
				typeof(Artist),
				typeof(Artwork),
				typeof(Attraction),
				typeof(Audience),
				typeof(Author),
				typeof(BasicPublication),
				typeof(BingSearchApi),
				typeof(BirthDetail),
				typeof(Blog),
				typeof(Body),
				typeof(Book),
				typeof(Bookmark),
				typeof(BritishCartoonArchive),
				typeof(CameraSettings),
				typeof(Cartoon),
				typeof(CategoryInterviews),
				typeof(Channel),
				typeof(CitationInfo),
				typeof(CiteseerxCiting),
				typeof(CiteseerxRecord),
				typeof(CiteseerxSearch),
				typeof(CiteseerxSimilar),
				typeof(CiteseerxSummary),
				typeof(CiteulikeAuthor),
				typeof(CiteulikePaper),
				typeof(CiteulikeSearch),
				typeof(CiteulikeTag),
				typeof(CiteulikeUser),
				typeof(Collection),
				typeof(Comment),
				typeof(Commodity),
				typeof(ContactPoint),
				typeof(Contributor),
				typeof(CreativeWork),
				typeof(DateInfo),
				typeof(Dc),
				typeof(DcDocument),
				typeof(DeliciousHomepage),
				typeof(DeliciousSearch),
				typeof(DleseGetRecord),
				typeof(DleseRecord),
				typeof(DleseRecord1),
				typeof(DleseRecord2),
				typeof(DleseRecordHead),
				typeof(DleseUserSearch),
				typeof(Dlms),
				typeof(DocumentSet),
				typeof(Educational),
				typeof(EmergentEvent),
				typeof(EmergentEventCollection),
				typeof(FastflipSearch),
				typeof(FlickrAuthor),
				typeof(FlickrPhoto),
				typeof(FlickrTag),
				typeof(GaurdianComic),
				typeof(General),
				typeof(GetRecordAdditionalMetadata),
				typeof(GisLocation),
				typeof(GlobeCartoon),
				typeof(GoogleBook),
				typeof(GooglePatent),
				typeof(GooglePatentAuthor),
				typeof(GoogleScholarSearch),
				typeof(GoogleScholarSearchResult),
				typeof(GoogleSorry),
				typeof(GoogleTrends),
				typeof(Grant),
				typeof(GrantProgram),
				typeof(GrantStaff),
				typeof(Head),
				typeof(Head1),
				typeof(Head2),
				typeof(Header),
				typeof(HotSearch),
				typeof(Hotel),
				typeof(IcdlBook),
				typeof(IcdlBookPreview),
				typeof(IcdlImage),
				typeof(IcdlImageResult),
				typeof(IeeeXploreArticle),
				typeof(IeeeXploreCitations),
				typeof(IeeeXploreReferences),
				typeof(IeeeXploreSearch),
				typeof(ImageSearch),
				typeof(ImageSearchResult),
				typeof(ImdbMovie),
				typeof(ImdbPerson),
				typeof(InformaWorld),
				typeof(Investigator<>),
				typeof(Item),
				typeof(ItemRecord),
				typeof(KeywordSet),
				typeof(Lifecycle),
				typeof(Lolz),
				typeof(MediaContent),
				typeof(MmArtwork),
				typeof(MobileRichBookmark),
				typeof(MobileRichBookmarkCollection),
				typeof(MomaArtwork),
				typeof(Movie),
				typeof(MoviePerson),
				typeof(NetflixMovie),
				typeof(Nsdl),
				typeof(NsdlDocument),
				typeof(NsdlService),
				typeof(NsfAward),
				typeof(NsfDivision),
				typeof(NsfDivisionStaffList),
				typeof(NsfInvestigator),
				typeof(NsfProgram),
				typeof(NsfProgramStaffList),
				typeof(NsfSearch),
				typeof(NsfStaff),
				typeof(Opml),
				typeof(Organization),
				typeof(Outline),
				typeof(Page),
				typeof(Paragraph),
				typeof(Patent),
				typeof(PatentAuthor),
				typeof(PatentClassification),
				typeof(PdfMixin),
				typeof(Periodical),
				typeof(Person),
				typeof(PersonnelInterview),
				typeof(Photostream),
				typeof(PoliticalCartoon),
				typeof(Post),
				typeof(PostalAddress),
				typeof(Product),
				typeof(Publication),
				typeof(Publisher),
				typeof(PubmedArticle),
				typeof(PubmedAuthor),
				typeof(PubmedJournal),
				typeof(Rating),
				typeof(RecordMetaMetadata),
				typeof(RecordMetadata),
				typeof(RedditSearchResults),
				typeof(Restaurant),
				typeof(RestaurantGenre),
				typeof(ResultInfo),
				typeof(Review),
				typeof(RottenMovie),
				typeof(RottenPerson),
				typeof(Rss),
				typeof(Rss22),
				typeof(ScholarlyArticle),
				typeof(ScienceDirectArticle),
				typeof(ScopusArticle),
				typeof(ScopusAuthor),
				typeof(ScopusSearch),
				typeof(Search<>),
				typeof(SearchAdditionalMetadataAdn),
				typeof(SearchCrumb),
				typeof(SearchMeta),
				typeof(SearchResults),
				typeof(SearchSection),
				typeof(Section),
				typeof(Service),
				typeof(SfuCartoonArchive),
				typeof(SlashdotArticle),
				typeof(SlashdotItem),
				typeof(SlashdotRss),
				typeof(SlashdotSearch),
				typeof(SocialMediaSearch1),
				typeof(SocialMediaSearch2<>),
				typeof(SocialMediaSearchResult),
				typeof(Spotrep),
				typeof(Subject),
				typeof(TempFieldValueHolder),
				typeof(TermType),
				typeof(Thumbnail),
				typeof(Topic),
				typeof(TopicCluster),
				typeof(TribunalVoices),
				typeof(TripAdvisorThingsToDo),
				typeof(TrumanLibrary1948CampaignCartoons),
				typeof(Tumblr),
				typeof(TumblrSearch),
				typeof(TvShow),
				typeof(TvShowEpisode),
				typeof(UrbanSpoonSearch),
				typeof(UserSearchAdditionalMetadata),
				typeof(UvaModel),
				typeof(Video),
				typeof(VideoInterview),
				typeof(WeatherReport),
				typeof(WikipediaCategoryType),
				typeof(WikipediaMobilePage),
				typeof(WikipediaPage),
				typeof(WikipediaPageType),
				typeof(YahooGeoCode),
				typeof(YahooGeoCodeResult),
				typeof(YahooMediaRss),
				typeof(YahooResult),
				typeof(YahooResultSet),
				typeof(YahooThumbnail),
				typeof(YelpBusiness),
				typeof(YoutubeSearchResults));
		}
	}
}
